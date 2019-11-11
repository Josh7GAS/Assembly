
import React from 'react';

function Background(props) {
    const bgStyle = {        
        width: `calc(${props.windowWidth}px)`, 
        height: `calc(${props.windowHeight}px)`, 
        top: 0,
        left: 0,
        position: 'absolute'        
    };

    return (
        <img src={props.imagemMarBackground} style={bgStyle} />
    );
}

function MolduraBambu(props){
    const bgStyle = {        
        width: `calc(1300px)`, 
        height: `calc(600px)`, 
        top: 10 ,
        left: 0,
        position: 'absolute'        
    };

    return (
    <img src={props.molduraBambuBackground} style={bgStyle} />
    );
}

export {Background, MolduraBambu};