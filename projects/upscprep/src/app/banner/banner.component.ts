import { Component } from '@angular/core';
import { Input } from '@angular/core';
import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms'; 
@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent {
  @Input() title?: string;
@Input() text?: string;

  cards = [
    { 
      title: 'Prelims 360', 
      text: 'Starting Date - 2 March 2023', 
      category: 'prelims',
      imageUrl: '../../assets/1.jpg'  
    },
    { 
      title: 'UPSC Essential', 
      text: 'Starting Date - 5 June 2023', 
      category: 'mains',
      imageUrl: '../../assets/2.jpg'    // Add image URL here
    },
    { 
      title: 'UPSC Mains 360', 
      text: 'Starting Date - 2 March 2023', 
      category: 'mains',
      imageUrl: '../../assets/3.jpg'  
    },
    { 
      title: 'Interview 360', 
      text: 'Starting Date - 5 June 2023', 
      category: 'mains',
      imageUrl: '../../assets/4.jpg'  
    }
    
  ];
  /*topper*/
  toppers = [
    { photo: '../../assets/garima.jpg', name: 'Garima Lohia', description: 'AIR 2' },
    { photo: '../../assets/sood.jpg', name: 'Pourush Sood', description: 'AIR 29' },
    { photo: '../../assets/joshi.jpg', name: 'Dikshita Joshi', description: 'AIR 58' },
    { photo: '../../assets/jain.jpg', name: 'Ayan Jain', description: 'AIR 87' },
    { photo: '../../assets/rupal.jpg', name: 'Rupal Shrivastava', description: 'AIR 113' }, 
  ];
  topperGroups: any[];
  private groupToppers(toppers: any[], toppersPerSlide: number): any[] {
    const groups = [];
    for (let i = 0; i < toppers.length; i += toppersPerSlide) {
      groups.push(toppers.slice(i, i + toppersPerSlide));
    }
    return groups;
  }
  
  constructor(config: NgbCarouselConfig) {
    config.interval = 2000; 
  config.wrap = true;
  config.keyboard = true;
  config.pauseOnHover = true;

  
  
    this.topperGroups = this.groupToppers(this.toppers, 6);
  }
  currentCategory = 'all';

  setCategory(category: string) {
    this.currentCategory = category;
  }
/*Feedback*/
  filterCards(card: any)  {
    return this.currentCategory === 'all' || card.category === this.currentCategory;
  }
  feedback = {
    fullName: '',
    content: ''
  };

  submitFeedback(): void {
    console.log('Feedback:', this.feedback);
    
  }
}
