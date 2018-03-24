import {
  default as React,
  Component
} from 'react';
import logo from './logo.svg';
import './App.css';
import PieChart from './pie';
import styled from "styled-components";
import cockpit from "./cockpit.png"
import rightRect from "./right_rec.png"
import a1 from "./a1.png"
import a2 from "./a2.png"

const RowContainer = styled.div`
  display: flex;
  justify-content: space-around;
  background-color: #2C3238;
  padding-bottom: 20px;
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


const data2 = [{name: 'Group A', value: 200}, {name: 'Group B', value: 300},
                  {name: 'Group C', value: 900}, {name: 'Group D', value: 200}];
          
const data1 = [{name: 'Group A', value: 200}, {name: 'Group B', value: 80},
{name: 'Group C', value: 200}, {name: 'Group D', value: 200}];
 

const data3 = [{name: 'Group A', value: 4}, {name: 'Group B', value: 40},
                  {name: 'Group C', value: 30}, {name: 'Group D', value: 56}];
                   


  const data4 = [{name: 'Group A', value: 2}, {name: 'Group B', value: 9},
  {name: 'Group C', value: 3}, {name: 'Group D', value: 8}];
    

class App extends Component {
  async componentDidMount(){
    //const rawRes = await fetch("http://localhost:9090/mbition2018/loginfo", {mode: "no-cors"})
    //console.log(rawRes, "rawData")
    //const rawData = await rawRes.body()
    //console.log(rawData)
  }
  render() {
    return (
      <div className="App">
        <img src={cockpit} style={{width: "100%"}}/>
        <div className="App-intro">
        <Title>Mercedes behaivoural Data</Title>
        <RowContainer>
          <PieContainer>
            <PieChart 
              title={'DESKTOP'}
              subtitle={'Time spent per application'}
              activeIndex={0}
              data={data1} />
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
              data={data3}/>
          </PieContainer>
          <PieContainer>
            <PieChart
              title={'London'}
              subtitle={'Use frecueny of search word'}
              activeIndex={3}
              data={data4}/>
          </PieContainer>
        </RowContainer>
        <RowContainer>
        <img src={a1} style={{height: "250px"}}/>
        <img src={a2} style={{height: "250px"}}/>

          </RowContainer>
        </div>
      </div>
    );
  }
}

export default App;
