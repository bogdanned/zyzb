import React from 'react';
import styled from "styled-components";
const {PieChart, Pie, Sector, Cell} = require('recharts');

const COLORS = ['#61E5EF', '#34C2CD', '#2A7882', '#2A4046'];

const Title= styled.h3`
  text-align: left;
  color: #B8B8B8;
  font-size: 12px;
  font-weight: normal;
  padding-left: 20px;
`;

const SubTitle= styled.h5`
  text-align: left;
  color: #B8B8B8;
  font-size: 10px;
  font-weight: normal;
  text-align: center;
`;

const PieContainer = styled.div`
  width: 100%;
  align-items: center;
  justify-content: center;
  display: flex;
  flex-direction: column;
`;


export default ({activeIndex, data, title, subtitle}) => {

  	return (
          <PieContainer >
                     <Title>{title}</Title>

                        <PieChart height={200} width={200}>
        <Pie 
         activeIndex={activeIndex}
          data={data} 
          innerRadius={30}
          outerRadius={60} 
          fill="#287AA2"
          label={true}
          onMouseEnter={()=>(console.log('enter'))}
        >
                	{
          	data.map((entry, index) => <Cell key={index} fill={COLORS[index % COLORS.length]}/>)
          }
          </Pie>
       </PieChart>
       <SubTitle>{subtitle}</SubTitle>

          </PieContainer >

    )
}
