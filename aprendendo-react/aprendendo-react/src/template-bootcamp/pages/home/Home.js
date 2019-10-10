import React,{ Component } from 'react';
import Navbar from './components/Navbar';

export default class Home extends Component{
    render(){
        return(
            <div className="geral mainBackground">
           <Navbar/>
            <section>
                <span>A conta Banco Digital te dá acesso a um novo patamar de produtos e serviços bancários. Bem vindo ao
                    futuro.</span>
                <button className="itensHovered btnOutline btnDefault">Continuar</button>
            </section>
        </div>
        );
    }
}