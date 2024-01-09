import { Component, ElementRef, HostListener, Renderer2, ViewChild } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  constructor(private renderer: Renderer2, private el: ElementRef, private router: Router) {}

  @ViewChild('videosContainer') videosContainer!: ElementRef;

  ngAfterViewInit() {
    this.muteVideos();
  }

  muteVideos() {
    const videos = this.videosContainer.nativeElement.querySelectorAll('video');
    videos.forEach((video: { volume: number; muted: boolean; }) => {
      video.volume = 0;
      video.muted = true;
    });
  }


  ngOnInit(): void {
    this.renderer.addClass(document.body, 'no-scroll');
  }

  ngOnDestroy(): void {

    this.renderer.removeClass(document.body, 'no-scroll');
  }

  onTrouverClick() {
    this.router.navigate(['/events']);
  }


  videos = [
    { src: 'assets/vid1.mp4' },
    { src: 'assets/vid2.mp4' },
    { src: 'assets/vid3.mp4' },
    { src: 'assets/vid4.mp4' },
  ];

  slides = [
    { title: 'SOIRÉE ', status: 'Music & Dance' },
    { title: 'FOOTBALL', status: 'Sport' },
    { title: 'MARATHON', status: 'Sport' },
    { title: 'FILMS , SPECTACLE', status: 'Cinema & theatre' },
  ];

  selectedVideoIndex = 0;

  selectVideo(index: number): void {
    if (this.selectedVideoIndex !== index) {
      this.selectedVideoIndex = index;
    }
  }

}
