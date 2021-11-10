import React, { Component } from "react";

export class AdditionalTableRow extends Component {

    render() {
        let c = this.props.additionalCourse;
        return <tr>
            <td>{ c.id }</td>
            <td>{ c.description }</td>
            <td>{ c.semester}</td>
            <td>{ c.prefix}</td>
            <td>{ c.number}</td>
            <td>{ c.grade}</td>
            {/* {<td>{ this.props.distributiveCourses.join(", ") }</td> } */}
            <td>
                <button className="btn btn-sm btn-warning m-1"
                    onClick={ () => this.props.editCallback(c) }>
                        Edit
                </button>               
            </td>
        </tr>
    }
}
