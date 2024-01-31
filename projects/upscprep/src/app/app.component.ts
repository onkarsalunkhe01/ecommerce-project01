import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'upscprep';
  dropdownOpen = false;

  toggleDropdown(open: boolean) {
    this.dropdownOpen = open;
  }
  
}
