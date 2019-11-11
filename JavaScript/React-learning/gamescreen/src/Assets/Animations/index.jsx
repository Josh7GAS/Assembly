import React from 'react';
import ReactDOM from 'react-dom';
import posed from 'react-pose';
import 'styles.css';


const Box = posed.div({
    passive: {
        opacity: ['x', interpolate(
          [-200, -100, 100, 200],
          [0, 1, 1, 0]
        )]
      }
    });

  class Example extends React.Component {
    state = { isVisible: true };
  
    componentDidMount() {
      setInterval(() => {
        this.setState({ isVisible: !this.state.isVisible });
      }, 1000);
    }
  
    render() {
      const { isVisible } = this.state;
      return (<Box className="box" pose={isVisible ? 'visible' : 'hidden'} />);
    }
  }
  
  ReactDOM.render(<Example />, document.getElementById('root'));

