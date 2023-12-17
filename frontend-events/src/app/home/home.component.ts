import { Component, ElementRef, HostListener, Renderer2, ViewChild } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

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


  constructor(private renderer: Renderer2, private el: ElementRef) {}

  ngOnInit(): void {
    // Add the 'no-scroll' class to the body element when the component is initialized
    this.renderer.addClass(document.body, 'no-scroll');
  }

  ngOnDestroy(): void {
    // Remove the 'no-scroll' class from the body element when the component is destroyed
    this.renderer.removeClass(document.body, 'no-scroll');
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
