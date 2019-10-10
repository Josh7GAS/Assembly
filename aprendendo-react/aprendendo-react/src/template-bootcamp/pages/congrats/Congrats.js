import React, { Component } from 'react';
import Navbar from '../../component/Navbar';

export default class Congrats extends Component {

    render() {
        console.log(this.props)
        return (<div className="geral mainBackground">
            <Navbar>
                <div id="logo"></div>
                <input type="text" placeholder="O que você está procurando" />
                <div id="signin">
                    <a className="itensHovered" href="">Entrar</a>
                </div>
            </Navbar>
            <section>
                <span>Parabéns {this.props.name}, sua conta está pronta para uso.</span>
                <button className="itensHovered btnOutline btnDefault">Voltar</button>
            </section>
        </div>);
    }
}