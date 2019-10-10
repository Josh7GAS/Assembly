import React, { Component } from 'react';

export default class Step1 extends Component {
    constructor(props) {
        super(props);

        this.state = {
            name: '',
            date: ' ',
            cpf: 0,
            agree: 'false'

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
        return (<div className="mainNoColor geral">

            <nav>
                <div id="logo"></div>
                <input type="text" placeholder="O que você está procurando" />
                <div id="signin">
                    <a className="itensHovered" href="">Entrar</a>
                </div>
            </nav>

            <section id="formSection">

                <div className="header">
                    <p>Você está em
                    Página inicial/Abertura de conta</p>
                    <p className="bold">Dados pessoais</p>
                </div>

                <div className="formContainer">
                    <form onSubmit={() => this.props.change(1, this.state)}>
                        <label className="cursorP" htmlFor="name">Nome</label>
                        <input onChange={(event) => this.handleChange(event)} id="name" type="text" placeholder="Roberto Silva" />
                        <label className="cursorP" htmlFor="date">Data de nascimento</label>
                        <input onChange={(event) => this.handleChange(event)} id="date" type="text" placeholder="11/06/1993" />
                        <label className="cursorP" htmlFor="cpf">CPF</label>
                        <input onChange={(event) => this.handleChange(event)} id="cpf" type="text" placeholder="444.444.444-90" />
                        <div>
                            <input onChange={(event) => this.isChecked(event)} id="agree" type="checkbox" />
                            <label className="cursorP" htmlFor="agree">Li e concordo com os termos.</label>
                            <button className="btnBlue itensHovered" type="submit" href="#">Continuar</button>
                        </div>
                    </form>
                </div>

            </section>

            <section id="infoContainer">
                <p>Primeiro precisamos te conhecer.</p>
                <p className="boldBlue">Vamos lá?</p>
            </section>

        </div>);

    }
}