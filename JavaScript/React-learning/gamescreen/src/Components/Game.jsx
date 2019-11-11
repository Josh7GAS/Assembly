import React from 'react';
import {Background, MolduraBambu} from './Background'
import ImagemMar from '../Assets/images/imagem-mar.jpg'
import Bambu from '../Assets/images/moldura-bambu.png'

class Game extends React.Component{

    constructor(props){
        super(props);

        

        this.state= {
            windowHeight : window.innerHeight,
            windowWidth : window.innerWidth
        }
    }

    onKeyDown = () => {
        console.log('key down')
    }
render(){
    return (<div onKeyDown={this.onKeyDown} tabIndex="0">
    <Background imagemMarBackground={ImagemMar}
        windowWidth={this.state.windowWidth} windowHeight={this.state.windowHeight} />     
    <MolduraBambu molduraBambuBackground={Bambu}
        windowWidth={this.state.windowWidth} windowHeight={this.state.windowHeight} />     
</div>)
}
}

export default Game;