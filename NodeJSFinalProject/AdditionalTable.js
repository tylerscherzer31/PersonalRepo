import React, { Component } from "react";
import { AdditionalTableRow } from "./AdditionalTableRow";

export class AdditionalTable extends Component {

    render() {
        const credit = this.props.credit;
        const courses = this.props.additionalCourses;
        const rows = [];
    
        courses.forEach((c) => {
            if (c.id === 1){ 
                rows.push(
                    <AdditionalTableRow
                        additionalCourse={c}
                        key={c.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (c.id === 2 && credit < 71){ 
                rows.push(
                    <AdditionalTableRow
                        additionalCourse={c}
                        key={c.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (c.id === 3 && credit < 40){
                rows.push(
                    <AdditionalTableRow
                        additionalCourse={c}
                        key={c.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (c.id === 4){
                rows.push(
                    <AdditionalTableRow
                        additionalCourse={c}
                        key={c.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (c.id === 5 && credit < 71){
                rows.push(
                    <AdditionalTableRow
                        additionalCourse={c}
                        key={c.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (c.id === 6 && credit < 40){
                rows.push(
                    <AdditionalTableRow
                        additionalCourse={c}
                        key={c.id}
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
                            { this.props.tableTop} { this.props.studentName }
                        </th>
                    </tr>
                    <tr>
                        <th>ID</th><th>Description</th><th>Semester</th><th>Prefix</th><th>Number</th><th>Grade</th>
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
