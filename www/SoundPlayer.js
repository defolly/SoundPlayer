var exec = require('cordova/exec');

var SoundPlayer = function(success, error) {
	exec(success, error, "SoundPlayer", "init", []);
}

SoundPlayer.prototype.playOk = function (success, error) {
	exec(success, error, "SoundPlayer", "playOk", []);
};

SoundPlayer.prototype.playError = function (success, error) {
	exec(success, error, "SoundPlayer", "playError", []);
};

SoundPlayer.prototype.playDataError = function (success, error) {
	exec(success, error, "SoundPlayer", "playDataError", []);
};

SoundPlayer.prototype.playScan = function(success, error) {
    exec(success, error, "SoundPlayer", "playScan", []);
};

SoundPlayer.prototype.playPifa = function(success, error) {
    exec(success, error, "SoundPlayer", "playPifa", []);
};

SoundPlayer.prototype.playYufenhuo = function(success, error) {
    exec(success, error, "SoundPlayer", "playYufenhuo", []);
};

SoundPlayer.prototype.playZhitong = function(success, error) {
    exec(success, error, "SoundPlayer", "playZhitong", []);
};

SoundPlayer.prototype.playZhouyang = function(success, error) {
    exec(success, error, "SoundPlayer", "playZhouyang", []);
};



module.exports = new SoundPlayer();
