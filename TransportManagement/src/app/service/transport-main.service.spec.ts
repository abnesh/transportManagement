import { TestBed, inject } from '@angular/core/testing';

import { TransportMainService } from './transport-main.service';

describe('TransportMainService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TransportMainService]
    });
  });

  it('should be created', inject([TransportMainService], (service: TransportMainService) => {
    expect(service).toBeTruthy();
  }));
});
