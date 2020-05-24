<?php

use Zend\Diactoros\Response\HtmlResponse;
use Zend\Diactoros\ServerRequestFactory;
use Framework\Http\ResponseSender;

chdir(dirname(__DIR__));

require 'vendor/autoload.php';

//$request = ServerRequestFactory::fromGlobals();
//
//$response = (new HtmlResponse("Hello, Oleh"))
//    ->withHeader('X-Developer','Oleg');
//
//
//$responseSender = new ResponseSender();
//$responseSender->send($response);

$directoryIterator = new DirectoryIterator(dirname(__DIR__));


foreach ($directoryIterator as $directory){
    echo $directory->getFileInfo() . "\n";
}