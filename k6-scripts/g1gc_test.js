import http from 'k6/http';
import { check } from 'k6';

export let options = {
  vus: 10, // Number of virtual users
  duration: '1s', // Test duration
};

export default function () {
  let res = http.get('http://gc-testing-app-zgc-k6:8080/gc/k6/hello-world');

  check(res, {
    'is status 200': (r) => r.status === 200
  });
}
