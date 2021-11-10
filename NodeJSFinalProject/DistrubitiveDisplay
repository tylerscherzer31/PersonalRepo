import React, { Component } from "react";
import { DistrubitiveEditor } from "./DistrubitiveEditor";
import { DistrubitiveTable } from "./DistrubitiveTable";

export class DistrubitiveDisplay extends Component {

    constructor(props) {
        super(props);
        this.state = {
            showEditor: false,
            selected: null
        }
    }

    startEditing = (distributiveCourse) => {
        this.setState({ showEditor: true, selected: distributiveCourse })
    }

    cancelEditing = () => {
        this.setState({ showEditor: false, selected: null })
    }

    saveSupplier= (distributiveCourse) => {
        this.props.saveCallback(distributiveCourse);
        this.setState({ showEditor: false, selected: null })        
    }

    render() {
        if (this.state.showEditor) {
            return <DistrubitiveEditor
                key={ this.state.selected.id || -1 }
                distributiveCourse={ this.state.selected } 
                saveCallback={ this.saveSupplier }
                cancelCallback={ this.cancelEditing } />
        } else {
            return <div className="m-2">
                    <DistrubitiveTable distributiveCourses={ this.props.distributiveCourses }
                        studentName = {this.props.studentName}
                        credit = {this.props.credit}
                        tableTop = { this.props.tableTop }
                        editCallback={ this.startEditing }
                    />
            </div>        
        }
    }
}
