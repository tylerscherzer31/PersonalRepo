import React, { Component } from 'react';
import { Selector } from './Selector';
import { AcademicDisplay } from './AcademicDisplay';
import { DistrubitiveDisplay } from './DistrubitiveDisplay';
import { AdditionalDisplay } from './AdditionalDisplay';
import Form from 'react-bootstrap/Form';

export default class ProductsAndSuppliers extends Component {

    constructor(props) {
        super(props);
        this.state = {
            academicCourses: [
                {id:1,description:"First Year Experience",semester:"",prefix:"FYE",number:"",grade:""},
                {id:2,description:"English Composition I",semester:"",prefix:"WRT",number:"120",grade:""},
                {id:3,description:"English Composition II",semester:"",prefix:"WRT",number:"200",grade:""},
                {id:4,description:"Mathematics",semester:"",prefix:"MAT",number:"151",grade:""},
                {id:5,description:"Interdisciplinary",semester:"",prefix:"",number:"",grade:""},
                {id:6,description:"Diverse Communities",semester:"",prefix:"",number:"",grade:""},
            ],
            distributiveCourses: [
                {id:1,description:"Science I",semester:"",prefix:"",number:"",grade:""},
                {id:2,description:"Science II",semester:"",prefix:"",number:"",grade:""},
                {id:3,description:"Behavioral & Social Science I",semester:"",prefix:"T",number:"",grade:""},
                {id:4,description:"Behavioral & Social Science II",semester:"",prefix:"",number:"",grade:""},
                {id:5,description:"Humanity I",semester:"",prefix:"",number:"",grade:""},
                {id:6,description:"Humanity II",semester:"",prefix:"",number:"",grade:""},
                {id:7,description:"Art",semester:"",prefix:"",number:"",grade:""},
            ],
            additionalCourses: [
                {id:1,description:"Writing Emphasis I",semester:"",prefix:"ENG",number:"",grade:""},
                {id:2,description:"Writing Emphasis II",semester:"",prefix:"WRT",number:"",grade:""},
                {id:3,description:"Writing Emphasis III",semester:"",prefix:"WRT",number:"",grade:""},
                {id:4,description:"Speaking Emphasis I",semester:"",prefix:"SPK",number:"",grade:""},
                {id:5,description:"Speaking Emphasis II",semester:"",prefix:"",number:"",grade:""},
                {id:6,description:"Speaking Emphasis III",semester:"",prefix:"",number:"",grade:""},
            ],
            tableTop:  "",
            studentName: '',
            credit: 0
        }
        this.idCounter = 100;
        this.handleNameChange = this.handleNameChange.bind(this);
        this.handleCreditsChange = this.handleCreditsChange.bind(this);
    }

    handleNameChange = (event) => {
        this.setState({studentName: event.target.value})
    }
    
    handleCreditsChange = (event) => {
        this.setState({credit: event.target.value})
    }

    saveData = (collection, item) => {
        if (item.id === "") {
            item.id = this.idCounter++;
            this.setState(state => state[collection] 
                = state[collection].concat(item));
        } else {
            this.setState(state => state[collection] 
                = state[collection].map(stored => 
                      stored.id === item.id ? item: stored))
        } 
    }

    render() {
        return <div>
            <Form className="h5 bg-info text-white p-2">
                    <Form.Group controlId="formBasicEmail">
                        <Form.Label>Full Name</Form.Label>
                        <Form.Control type="name" placeholder="Enter Full Name" onChange={this.handleNameChange}/>
                    </Form.Group>

                    <Form.Group controlId="formBasicPassword">
                        <Form.Label>Transferred Credits</Form.Label>
                        <Form.Control type="transfer" placeholder="Transfer" onChange={this.handleCreditsChange}/>
                        <Form.Text className="text-muted">
                            Please enter the total number of Transferred credits
                        </Form.Text>
                    </Form.Group> 
            </Form>
            <Selector>
                <AcademicDisplay 
                    name="Academic Foundation"
                    studentName = {this.state.studentName} 
                    credit = {this.state.credit}
                    tableTop = "Academic Foundation for "
                    acadmeicCourses={ this.state.academicCourses }
                    saveCallback={ p => this.saveData("academicCourses", p) }                     
                    />
                <DistrubitiveDisplay
                    name="Distributive Requirement"
                    studentName = {this.state.studentName} 
                    credit = {this.state.credit}
                    tableTop = "Distributive Requirement for "
                    distributiveCourses={ this.state.distributiveCourses } 
                    saveCallback={ s => this.saveData("distributiveCourses", s) }
                    />
                <AdditionalDisplay
                    name="Additional Requirement"
                    studentName = {this.state.studentName} 
                    credit = {this.state.credit}
                    tableTop = "Additional Requirement for "
                    additionalCourses={ this.state.additionalCourses } 
                    saveCallback={ s => this.saveData("additionalCourses", s) }
                    />               
            </Selector>
        </div>
    }
}
