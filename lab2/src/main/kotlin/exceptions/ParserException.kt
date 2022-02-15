package exceptions

class ParserException(fragment: String, pos: Long) : Exception("Unexpected token '$fragment' at pos $pos")