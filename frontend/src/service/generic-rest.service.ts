import 'rxjs/add/operator/map';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export abstract class GenericRestService<T> {
    constructor(protected http: HttpClient, protected actionUrl: string) {
    }

    public getAll(): Observable<T[]> {
        return this.http.get(this.actionUrl).map(resp => resp.json() as T[]);
    }
    public getById(id: number): Observable<T> {
        return this.http.get(`${this.actionUrl}${id}`).map(resp => resp.json() as T);
    }
}
