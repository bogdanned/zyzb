import {
  default as React,
  Component
} from 'react';
import logo from './logo.svg';
import './App.css';
import PieChart from './pie';
import styled from "styled-components";
import cockpit from "./cockpit.png"

const RowContainer = styled.div`
  display: flex;
  justify-content: center;
  background-color: #2C3238;
`;


const PieContainer = styled.div`
  display: flex;
  flex-grow: 1;
`;

const PieContainerGrey = styled.div`
  display: flex;
  flex-grow: 1;
  background-color: #3D4248;
`;


const BkgImage= styled.div`
position: absolute;
top: 0px;
left: 0px;
`;


const Title= styled.h2`
  text-align: left;
  color: #B8B8B8;
`;


const data2 = [{name: 'Group A', value: 400}, {name: 'Group B', value: 300},
                  {name: 'Group C', value: 300}, {name: 'Group D', value: 200}];
                   

class App extends Component {
  render() {
    return (
      <div className="App">
        <img src={cockpit} />
        <div className="App-intro">
        <Title>Mercedes behaivoural Data</Title>
        <RowContainer>
          <PieContainer>
            <PieChart 
              title={'DESKTOP'}
              subtitle={'Time spent per application'}
              activeIndex={0}
              data={data2} />
          </PieContainer>
          <PieContainerGrey >
            <PieChart
              title={'PHONE'}
              subtitle={'Use frecuency of input devices'}               
              activeIndex={1}
              data={data2}/>
          </PieContainerGrey >
          <PieContainer >
            <PieChart   
              title={'SPEEDING'}
              subtitle={'Movement status of the car'}        
              activeIndex={2}
              data={data2}/>
          </PieContainer>
          <PieContainer>
            <PieChart
              title={'London'}
              subtitle={'Use frecueny of search word'}
              activeIndex={3}
              data={data2}/>
          </PieContainer>
        </RowContainer>
        </div>
      </div>
    );
  }
}

export default App;
