// Call the dataTables jQuery plugin
$(document).ready(function() {
   loadEmployees();
  $('#employees').DataTable();
});

async function loadEmployees() {

  const request = await fetch('/employees', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const employees = await request.json();

  let listHTML = '';
  for (let employee of employees) {

    let employeeHTML = '<tr><td>'+employee.id+'</td><td>'+employee.name+'</td><td>'+employee.email+'</td><td>'+employee.role+'</td><td>'+employee.enterprise+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
    listHTML += employeeHTML;
  }

  console.log(employees);



document.querySelector('#employees tbody').outerHTML = listHTML;

}
