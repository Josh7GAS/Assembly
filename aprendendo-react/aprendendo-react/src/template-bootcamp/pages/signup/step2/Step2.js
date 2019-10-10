import React, { Component } from 'react';
import Navbar from '../../component/Navbar';

export default class Step2 extends Component {
    constructor(props) {
        super(props);

        this.state = {
            email: '',
            Senha: ' ',
            Confirmar: ''


        }
    }

    isChecked = () => {
        this.setState(prevState => ({
            agree: !prevState.agree
        }))
    }

    handleChange = (event) => {
        console.log(event.target.id);

        const state = Object.assign({}, this.state);

        let field = event.target.id;

        state[field] = event.target.value;

        this.setState(state);

    }

    render() {
        return (<div class="mainNoColor geral">

            <Navbar>
                <div id="logo"></div>
                <input type="text" placeholder="O que você está procurando" />
                <div id="signin">
                    <a class="itensHovered" href="">Entrar</a>
                </div>
            </Navbar>

            <section id="formSection">

                <div class="header">
                    <p>Você está em
                    Página incial/Abertura de conta</p>
                    <p class="bold">Dados pessoais</p>
                </div>

                <div class="formContainer">
                    <form action="./congrats.html">
                        <label class="cursorP" htmlfor="email">Email</label>
                        <input id="email" type="text" placeholder="you@example.com.br" />
                        <label class="cursorP" htmlfor="passwd">Senha</label>
                        <input id="passwd" type="password" placeholder="***************" />
                        <label class="cursorP" htmlfor="confirmPasswd">Confirme a senha</label>
                        <input id="confirmPasswd" type="password" placeholder="***************" />
                        <div>
                            <button class="btnBlue" type="submit" href="#">Continuar</button>
                        </div>
                    </form>
                </div>

            </section>

            <section id="infoContainer">
                <p>Beleza, agora defina como você irá </p>
                <p class="boldBlue">acessar</p>
                <p>sua conta.</p>
            </section>

        </div>
        );

    }

}