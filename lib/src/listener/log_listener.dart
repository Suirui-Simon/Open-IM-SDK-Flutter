class OnLogListener {
  Function(int? type, String? message)? _onPrint;

  OnLogListener(this._onPrint);

  void print(int? code, String? message) {
    if (null != _onPrint) _onPrint!(code, message);
  }
}
