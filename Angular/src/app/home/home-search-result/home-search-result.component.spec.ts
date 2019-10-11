import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeSearchResultComponent } from './home-search-result.component';

describe('HomeSearchResultComponent', () => {
  let component: HomeSearchResultComponent;
  let fixture: ComponentFixture<HomeSearchResultComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeSearchResultComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeSearchResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
