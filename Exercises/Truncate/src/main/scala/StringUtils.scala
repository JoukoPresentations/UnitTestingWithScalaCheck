object StringUtils {
  def truncate(str: String, n: Int): String = {
    if (str.length <= n) str
    else str.substring(0, n) + "..."
  }
}

