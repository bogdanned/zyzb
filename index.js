const fs = require('fs')
const path = require('path')
var tm = require('text-miner')


var buffer = fs.readFileSync("./19_3_2018.txt").toString();


var lines = buffer.trim()


var lines = buffer.split(/[\r\n]+/g)


function ecallParser(lines){
    return lines.forEach(l => {
        if(l.match(/(ServiceCall)+/g)){
            return l
        }
    })
}



function eSearchedarser(lines){
    const text = []
    lines.forEach(l => {
        if(l.match(/(SearchedText)+/g)){
            var str = l.trim().split(" ")
            text.push(str[1])
        }
    })
    return text
}

//const eCallList = ecallParser(lines)

var searchText = new tm.Corpus(eSearchedarser(lines));
var terms = new tm.Terms(searchText );

console.log(terms.findFreqTerms(1) , "Search terms")


function eTimeParser(lines){
    const text = []
    lines.forEach(l => {
        if(l.match(/(AppDirector::launch:)+/g)){
            var str = l.trim().split("AppDirector::launch:")
            text.push(str[1])
        }
    })
    return text
}


// 

console.log(eTimeParser(lines))



// function eTimeParser(lines){
//     const text = []
//     lines.forEach(l => {
//         if(l.match(/(AppDirector::launch:)+/g)){
//             var str = l.trim().split("getVehicleMovementStatus(success:")
//             text.push(str[1])
//         }
//     })
//     return text
// }
