import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TransportSearchResultComponent } from './transport-search-result.component';

describe('TransportSearchResultComponent', () => {
  let component: TransportSearchResultComponent;
  let fixture: ComponentFixture<TransportSearchResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TransportSearchResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TransportSearchResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
