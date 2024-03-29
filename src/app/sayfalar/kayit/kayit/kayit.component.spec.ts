import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KayitComponent } from './kayit.component';

describe('KayitComponent', () => {
  let component: KayitComponent;
  let fixture: ComponentFixture<KayitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KayitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KayitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
