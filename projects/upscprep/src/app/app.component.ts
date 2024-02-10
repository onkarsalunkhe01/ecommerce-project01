import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'upscprep';
  

  
  selectedButton: string = ''; // Initialize with an empty string or any default value

  selectButton(button: string) {
    this.selectedButton = button;
}
}
