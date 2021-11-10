import React, { Component } from "react";
import { AcademicTable } from "./AcademicTable"
import { AcademicEditor } from "./AcademicEditor";

export class AcademicDisplay extends Component {

    constructor(props) {
        super(props);
        this.state = {
            showEditor: false,
            selectedAcademicCourse: null
        }
    }

    startEditing = (academicCourse) => {
        this.setState({ showEditor: true, selectedAcademicCourse: academicCourse })
    }

    cancelEditing = () => {
        this.setState({ showEditor: false, selectedAcademicCourse: null })
    }

    saveProduct = (academicCourse) => {
        this.props.saveCallback(academicCourse);
        this.setState({ showEditor: false, selectedAcademicCourse: null })        
    }

    render() {
        if (this.state.showEditor) {
            return <AcademicEditor 
                key={ this.state.selectedAcademicCourse.id || -1 }
                academicCourse={ this.state.selectedAcademicCourse } 
                saveCallback={ this.saveProduct }
                cancelCallback={ this.cancelEditing } />
        } else {
            return <div className="m-2">
                <AcademicTable acadmeicCourses={ this.props.acadmeicCourses }
                    studentName = {this.props.studentName}
                    credit = {this.props.credit}
                    tableTop = { this.props.tableTop }
                    editCallback={ this.startEditing }
                    />            
            </div>
        }
    }
}
