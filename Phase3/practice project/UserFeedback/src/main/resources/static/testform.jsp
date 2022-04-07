functionSubmitTestForm() {
	
	//TODO: gather fields from form
	//TODO: Jsonify form fields
	//TODO: Call postFormDataAsJson to http://localhost:8090/your/endpoint
alert("The form was submitted");
}

/**
 * Helper function for POSTing data as JSON with fetch.
 *
 * @param {Object} options
 * @param {string} options.url - URL to POST data to
 * @param {FormData} options.formData - `FormData` instance
 * @return {Object} - Response body from URL that was POSTed to
 */
asyncfunctionpostFormDataAsJson({ url, formData }) {
	/**
	 * We can't pass the `FormData` instance directly to `fetch`
	 * as that will cause it to automatically format the request
	 * body as "multipart" and set the `Content-Type` request header
	 * to `multipart/form-data`. We want to send the request body
	 * as JSON, so we're converting it to a plain object and then
	 * into a JSON string.
	 * 
	 * @seehttps://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/POST
	 * @seehttps://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/fromEntries
	 * @seehttps://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify
	 */
	constplainFormData=Object.fromEntries(formData.entries());
	constformDataJsonString=JSON.stringify(plainFormData);

	constfetchOptions= {
		/**
		 * The default method for a request with fetch is GET,
		 * so we must tell it to use the POST HTTP method.
		 */
		method: "POST",
		/**
		 * These headers will be added to the request and tell
		 * the API that the request body is JSON and that we can
		 * accept JSON responses.
		 */
		headers: {
			"Content-Type": "application/json",
			"Accept": "application/json"
		},
		/**
		 * The body of our POST request is the JSON string that
		 * we created above.
		 */
		body: formDataJsonString,
	};

	constresponse=awaitfetch(url, fetchOptions);

	if(!response.ok) {
		consterrorMessage=awaitresponse.text();
		thrownewError(errorMessage);
	}

	returnresponse.json();
}
