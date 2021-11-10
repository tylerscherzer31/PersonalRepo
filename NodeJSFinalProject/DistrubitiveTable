import React, { Component } from "react";
import { DistrubitiveTableRow } from "./DistrubitiveTableRow";

export class DistrubitiveTable extends Component {

    render() {
        const credit = this.props.credit;
        const courses = this.props.distributiveCourses;
        const rows = [];
    
        courses.forEach((s) => {
            if (s.id === 1){ 
                rows.push(
                    <DistrubitiveTableRow
                        distributiveCourse={s}
                        key={s.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (s.id === 2){ 
                rows.push(
                    <DistrubitiveTableRow
                        distributiveCourse={s}
                        key={s.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (s.id === 3){ 
                rows.push(
                    <DistrubitiveTableRow
                        distributiveCourse={s}
                        key={s.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (s.id === 4){ 
                rows.push(
                    <DistrubitiveTableRow
                        distributiveCourse={s}
                        key={s.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (s.id === 5){ 
                rows.push(
                    <DistrubitiveTableRow
                        distributiveCourse={s}
                        key={s.id}
                        editCallback={this.props.editCallback}
                    />
                );
            }
            if (s.id === 6){ 
                rows.push(
                    <DistrubitiveTableRow
                        distributiveCourse={s}
                        key={s.id}
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
