import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})

export class AppComponent implements OnInit {
  title = 'frontend';
  person: any;

  public url = 'http://container-springbootb:8091/sendtoangular'

  constructor(public http: HttpClient) {}
  
  ngOnInit() {

     // Simple GET request with response type <any>
      this.http.get(this.url).subscribe({
      next: data => {
          this.person = data;
          console.log("data: "+data);
          console.log("receive: "+this.person);
          console.log("data: "+JSON.stringify(data));
          console.log("receive: "+JSON.stringify(this.person));
      },
      error: error => {
        console.error('There was an error!', error);
    }
  })
  }
}