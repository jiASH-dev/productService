let pagingCase = document.getElementsByClassName('pagingRow__case')[0];
let currentPageNumber = document.getElementsByClassName('pagingRow__case__currentPageNumber')[0];
let allPagesNumber = document.getElementsByClassName('pagingRow__case__allPagesNumber')[0];

if (parseInt(currentPageNumber.innerText) < parseInt(allPagesNumber.innerText) && parseInt(currentPageNumber.innerText) !== 1) {
    let rightForm = document.createElement('form');
    rightForm.action = 'http://localhost:8081/cases';
    rightForm.method = 'GET';
    rightForm.className = 'pagingRow__case__form';

    let rightFormStatusInput = document.createElement('input');
    rightFormStatusInput.type = 'hidden';
    rightFormStatusInput.name = 'productStatus';
    rightFormStatusInput.value = 'IN_STOCK';

    let rightFormPageNumberInput = document.createElement('input');
    rightFormPageNumberInput.type = 'hidden';
    rightFormPageNumberInput.name = 'pageNumber';
    rightFormPageNumberInput.value = parseInt(currentPageNumber.innerText) + 1;

    let rightFormSubmit = document.createElement('input');
    rightFormSubmit.type = 'submit';
    rightFormSubmit.className = 'pagingRow__case__form__nextButton';
    rightFormSubmit.value = 'След.';

    rightForm.appendChild(rightFormStatusInput);
    rightForm.appendChild(rightFormPageNumberInput);
    rightForm.appendChild(rightFormSubmit);

    pagingCase.appendChild(rightForm);

    ////

    let leftForm = document.createElement('form');
    leftForm.action = 'http://localhost:8081/cases';
    leftForm.method = 'GET';
    leftForm.className = 'pagingRow__case__form';

    let leftFormStatusInput = document.createElement('input');
    leftFormStatusInput.type = 'hidden';
    leftFormStatusInput.name = 'productStatus';
    leftFormStatusInput.value = 'IN_STOCK';

    let leftFormPageNumberInput = document.createElement('input');
    leftFormPageNumberInput.type = 'hidden';
    leftFormPageNumberInput.name = 'pageNumber';
    leftFormPageNumberInput.value = parseInt(currentPageNumber.innerText) - 1 ;

    let leftFormSubmit = document.createElement('input');
    leftFormSubmit.type = 'submit';
    leftFormSubmit.className = 'pagingRow__case__form__previousButton';
    leftFormSubmit.value = 'Пред.';

    leftForm.appendChild(leftFormStatusInput);
    leftForm.appendChild(leftFormPageNumberInput);
    leftForm.appendChild(leftFormSubmit);

    pagingCase.insertBefore(leftForm, currentPageNumber);
}
else if (parseInt(currentPageNumber.innerText) < parseInt(allPagesNumber.innerText)) {
    let rightForm = document.createElement('form');
    rightForm.action = 'http://localhost:8081/cases';
    rightForm.method = 'GET';
    rightForm.className = 'pagingRow__case__form';

    let rightFormStatusInput = document.createElement('input');
    rightFormStatusInput.type = 'hidden';
    rightFormStatusInput.name = 'productStatus';
    rightFormStatusInput.value = 'IN_STOCK';

    let rightFormPageNumberInput = document.createElement('input');
    rightFormPageNumberInput.type = 'hidden';
    rightFormPageNumberInput.name = 'pageNumber';
    rightFormPageNumberInput.value = parseInt(currentPageNumber.innerText) + 1;

    let rightFormSubmit = document.createElement('input');
    rightFormSubmit.type = 'submit';
    rightFormSubmit.className = 'pagingRow__case__form__nextButton';
    rightFormSubmit.value = 'След.';

    rightForm.appendChild(rightFormStatusInput);
    rightForm.appendChild(rightFormPageNumberInput);
    rightForm.appendChild(rightFormSubmit);

    pagingCase.appendChild(rightForm);
}
else if (parseInt(currentPageNumber.innerText) === parseInt(allPagesNumber.innerText)) {
    let leftForm = document.createElement('form');
    leftForm.action = 'http://localhost:8081/cases';
    leftForm.method = 'GET';
    leftForm.className = 'pagingRow__case__form';

    let leftFormStatusInput = document.createElement('input');
    leftFormStatusInput.type = 'hidden';
    leftFormStatusInput.name = 'productStatus';
    leftFormStatusInput.value = 'IN_STOCK';

    let leftFormPageNumberInput = document.createElement('input');
    leftFormPageNumberInput.type = 'hidden';
    leftFormPageNumberInput.name = 'pageNumber';
    leftFormPageNumberInput.value = parseInt(currentPageNumber.innerText) - 1 ;

    let leftFormSubmit = document.createElement('input');
    leftFormSubmit.type = 'submit';
    leftFormSubmit.className = 'pagingRow__case__form__previousButton';
    leftFormSubmit.value = 'Пред.';

    leftForm.appendChild(leftFormStatusInput);
    leftForm.appendChild(leftFormPageNumberInput);
    leftForm.appendChild(leftFormSubmit);

    pagingCase.insertBefore(leftForm, currentPageNumber);
}

pagingCase.style.padding = '0 35%';