import React, { Component } from "react";
import { AdditionalEditor } from "./AdditionalEditor";
import { AdditionalTable } from "./AdditionalTable";

export class AdditionalDisplay extends Component {

    constructor(props) {
        super(props);
        this.state = {
            showEditor: false,
            selected: null
        }
    }

    startEditing = (additionalCourse) => {
        this.setState({ showEditor: true, selected: additionalCourse })
    }

    cancelEditing = () => {
        this.setState({ showEditor: false, selected: null })
    }

    saveSupplier= (additionalCourse) => {
        this.props.saveCallback(additionalCourse);
        this.setState({ showEditor: false, selected: null })        
    }

    render() {
        if (this.state.showEditor) {
            return <AdditionalEditor
                key={ this.state.selected.id || -1 }
                additionalCourse={ this.state.selected } 
                saveCallback={ this.saveSupplier }
                cancelCallback={ this.cancelEditing } />
        } else {
            return <div className="m-2">
                    <AdditionalTable additionalCourses={ this.props.additionalCourses }
                        studentName = { this.props.studentName }
                        credit = { this.props.credit }
                        tableTop = { this.props.tableTop }
                        editCallback={ this.startEditing }
                    />
            </div>        
        }
    }
}
