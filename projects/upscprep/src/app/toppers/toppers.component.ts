import { Component } from '@angular/core';
import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';
@Component({
  selector: 'app-toppers',
  templateUrl: './toppers.component.html',
  styleUrls: ['./toppers.component.css']
})
export class ToppersComponent {
  
  toppers = [
    { photo: '../../assets/male.jpg', name: 'Topper 1', description: 'Description 1' },
    { photo: '../../assets/male.jpg', name: 'Topper 2', description: 'Description 2' },
    { photo: '../../assets/male.jpg', name: 'Topper 3', description: 'Description 3' },
    { photo: '../../assets/male.jpg', name: 'Topper 4', description: 'Description 4' },
    { photo: '../../assets/male.jpg', name: 'Topper 5', description: 'Description 5' },
    { photo: '../../assets/male.jpg', name: 'Topper 6', description: 'Description 6' },
    { photo: '../../assets/male.jpg', name: 'Topper 7', description: 'Description 7' },
    { photo: '../../assets/male.jpg', name: 'Topper 8', description: 'Description 8' },
    { photo: '../../assets/male.jpg', name: 'Topper 9', description: 'Description 9' },
    { photo: '../../assets/male.jpg', name: 'Topper 10', description: 'Description 10' },
    { photo: '../../assets/male.jpg', name: 'Topper 11', description: 'Description 11' },
    { photo: '../../assets/male.jpg', name: 'Topper 12', description: 'Description 12' },
  ];

  ngAfterViewInit() {
    new bootstrap.Carousel(document.getElementById('toppersCarousel'), {
      interval: 2000,
      wrap: true
    });
  }

  constructor(config: NgbCarouselConfig) {
    // customize default values of carousels used by this component tree
    config.interval = 2000;
    config.wrap = true;
    config.keyboard = false;
    config.pauseOnHover = false;
  }
}
