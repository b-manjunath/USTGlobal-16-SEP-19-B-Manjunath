import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LappyComponent } from './lappy.component';

describe('LappyComponent', () => {
  let component: LappyComponent;
  let fixture: ComponentFixture<LappyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LappyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LappyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
