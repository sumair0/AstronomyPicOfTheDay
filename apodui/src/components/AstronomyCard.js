import React from 'react' ;


const AstronomyCard = (props) => {

    // const {title , url , bigurl , description}
    return(
        <div className="card">

            <h3 className="card-title">{props.data.title}</h3>

            <a href={props.data.hdurl}>
                <img src={props.data.url} />
            </a>

            <p>{props.data.explanation}</p>


        </div>
    )
}


export default AstronomyCard ;