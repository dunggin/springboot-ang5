import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Student} from '../models/students';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {

  students: Student[];
  student: Student;
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.getAllStudents();
  }

  getAllStudents() {
    this.http.get<Student[]>('http://localhost:8080/api/getStudent').subscribe(data => {
      this.students = data,
      console.log(data);
    });
  }

}
