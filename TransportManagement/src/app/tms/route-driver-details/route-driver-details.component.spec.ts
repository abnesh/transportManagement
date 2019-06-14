import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RouteDriverDetailsComponent } from './route-driver-details.component';

describe('RouteDriverDetailsComponent', () => {
  let component: RouteDriverDetailsComponent;
  let fixture: ComponentFixture<RouteDriverDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RouteDriverDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RouteDriverDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
