import { Injectable } from '@angular/core';
import { Todo } from '../models/todo';
import { AppConfiguration } from '../common/config/app-configuration.service';
import { APIService } from '../common/api.service';
import { AuthService } from '../common/auth.service';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class TodoService extends APIService {
    private resourceUrl = 'api/todo';
    private todos: Todo[] = [];

    constructor(public config: AppConfiguration,
        public authService: AuthService,
        public http: Http) {
        super(config, authService, http);
        }

    create(des: string, num: Number, bol: boolean){
        return this.post('api/newtodo', { description:des, priority:num,completed:bol })
	
    }
    list(): Observable<Todo[]> {
        return this.get(this.resourceUrl);
    }
}
