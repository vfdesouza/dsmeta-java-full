import logo from '../../assets/img/logo.svg'
import './styles.css'

function Hearder() {
        return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Projeto didático, desenvolvido em parceria com a 
                    <a href="https://www.instagram.com/devsuperior.ig"> @devsuperior.ig</a>
                     na Semana Spring React - 07/2022
                </p>
            </div>
        </header>
    )
}

export default Hearder
