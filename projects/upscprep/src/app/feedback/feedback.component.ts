import { Component } from '@angular/core';

@Component({
  selector: 'app-feedback',
  standalone: true,
  imports: [],
  templateUrl: './feedback.component.html',
  styleUrl: './feedback.component.css'
})
export class FeedbackComponent {
  user = {
    name: '',
    feedback: ''
  };

  submitFeedback(form: any) {
    console.log('Feedback Submitted', form.value);
    // Handle form submission (e.g., send data to a server)
    form.reset(); // Optionally reset the form
  }

}
