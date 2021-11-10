import React, { Component } from "react";
import { AcademicTableRow } from "./AcademicTableRow";

export class AcademicTable extends Component {

    render() {
        const credit = this.props.credit;
        const courses = this.props.acadmeicCourses;
        const rows = [];
    
        courses.forEach((p) => {
            if (p.id === 1){ 
                rows.push(
                    <AcademicTableRow
                        academicCourse={p}
                        key={p.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (p.id === 2){ 
                rows.push(
                    <AcademicTableRow
                        academicCourse={p}
                        key={p.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (p.id === 3){
                rows.push(
                    <AcademicTableRow
                        academicCourse={p}
                        key={p.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (p.id === 4){
                rows.push(
                    <AcademicTableRow
                        academicCourse={p}
                        key={p.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (p.id === 5){
                rows.push(
                    <AcademicTableRow
                        academicCourse={p}
                        key={p.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (p.id === 6){
                rows.push(
                    <AcademicTableRow
                        academicCourse={p}
                        key={p.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
        }

        )  

        return <table className="table table-sm table-striped table-bordered">
                <thead>
                    <tr>
                        <th colSpan="7" 
                                className="bg-primary text-white text-center h4 p-2">
                            { this.props.tableTop} {this.props.studentName }
                        </th>
                    </tr>
                    <tr>
                        <th>ID</th><th>Descreption</th><th>Semester</th><th>Prefix</th><th>Number</th><th>Grade</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        rows
                    }
                </tbody>
            </table>        
    }
}
