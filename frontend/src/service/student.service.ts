import { HttpClient } from '@angular/common/http';
import 'rxjs/add/operator/map';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { GenericRestService } from './generic-rest.service';
import { Student } from '../models/students';
import { Configuration } from '../constant/configuration';

@Injectable()
export class StudentService extends GenericRestService<Student> {
    constructor(http: HttpClient, configuration: Configuration) {
        super(http, configuration.ServerWithApiUrl);
    }
    getById(id: number): Observable<Student> {
        return this.http.get(`${this.actionUrl}${id}`).map(resp => resp.json() as Student);
    }
}
