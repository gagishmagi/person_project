import { Component } from '@angular/core';
import { HttpRequestService } from './http-request.service';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    title = 'Angular';
    url = 'http://localhost:8080/people';

    public data: any;

    constructor(private api: HttpRequestService) {
    }

    ngOnInit() {
        this.api
        .getPersonen(this.url)
        .subscribe(
            data => {
                console.log(data);
                this.data = data;
            },
            err => {
                console.log(err);
            }
        );
    }
}
