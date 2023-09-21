import React, { Component, Fragment } from "react";
import './Header.css';

class Header extends Component {

    render () {
        return (
            <div>
                <header className="header">
                    <h1>{this.props.children}</h1>
                </header>
            </div>
        )
    }
}

export default Header;