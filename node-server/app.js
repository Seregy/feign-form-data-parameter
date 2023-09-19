'use strict';

const express = require('express');
const multer = require('multer');

const PORT = 8090;
const HOST = '0.0.0.0';

const app = express();
const upload = multer();
app.post('/server/resources', upload.single('file'), (req, res) => {
  const response = {value: `Received file '${req.file.originalname}' with category '${req.body.category}' and priority '${req.body.priority}', query string was '${JSON.stringify(req.query)}'`};

  res.json(response);
});

app.listen(PORT, HOST, () => {
  console.log(`Running on http://${HOST}:${PORT}`);
});
