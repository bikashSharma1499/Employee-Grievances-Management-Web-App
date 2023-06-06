/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


const slides = document.querySelector('.slides');
let slideIndex = 0;

function showSlide(index) {
  const slideWidth = slides.clientWidth;
  slides.style.transform = `translateX(-${slideWidth * index}px)`;
}

function nextSlide() {
  slideIndex++;
  if (slideIndex >= slides.childElementCount) {
    slideIndex = 0;
  }
  showSlide(slideIndex);
}

function prevSlide() {
  slideIndex--;
  if (slideIndex < 0) {
    slideIndex = slides.childElementCount - 1;
  }
  showSlide(slideIndex);
}

setInterval(nextSlide, 3000); // Automatically advance to the next slide every 3 seconds
