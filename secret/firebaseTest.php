<?php
require_once 'firebaseLib.php';
// --- This is your Firebase URL
$url = 'https://epicsuprc.firebaseio.com/';
// --- Use your token from Firebase here
$token = 'LKWz7g6fTWHrl4FG405vjofLkx3eIVsHDTyV1u34';
// --- Here is your parameter from the http GET
$arduino_data = $_GET['arduino_data'];
$arduino_data_post = $_POST['name'];
// --- Set up your Firebase url structure here
$firebasePath = '/';
/// --- Making calls
$fb = new fireBase($url, $token);
$dateTime = new DateTime();

$response = $fb->set($firebasePath. '/' . $dateTime->format('c'), $arduino_data);


sleep(2);


?>

<html> Test Page </html>