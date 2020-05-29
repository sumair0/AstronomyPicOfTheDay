import React, {Component} from 'react';
import AstronomyCard from './AstronomyCard' ;
import Axios from 'axios';

class AstronomyContainer extends Component{

    constructor(){
        super() ;

        this.state = {
            astronomy : [] 
        }
    }


    componentDidMount(){


        const END_POINT = "http://localhost:8742/apod" ;

        Axios.get(END_POINT)
             .then((response) => {
                 this.setState({
                     astronomy : response.data
                 })
             })

        // console.log(this.state.astronomy)

        // fetch(END_POINT)
        //     .then(response => response.json() )
        //     .then(astronomy => this.setState({astronomy}))


        // console.log(this.state.astronomy) ;



    }



    render(){

        const {astronomy} = this.state ;

        return(
            <AstronomyCard data={astronomy} />
        )
    }
}


export default AstronomyContainer;