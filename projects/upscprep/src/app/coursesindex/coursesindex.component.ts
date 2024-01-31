import { Component } from '@angular/core';
import { Input } from '@angular/core';

@Component({
  selector: 'app-coursesindex',
  templateUrl: './coursesindex.component.html',
  styleUrls: ['./coursesindex.component.css']
})
export class CoursesindexComponent {
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
      imageUrl: '../../assets/4.jpg'    // Add image URL here
    }
    
  ];

  currentCategory = 'all';

  setCategory(category: string) {
    this.currentCategory = category;
  }

  filterCards(card: any)  {
    return this.currentCategory === 'all' || card.category === this.currentCategory;
  }
}
