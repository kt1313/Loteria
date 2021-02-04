package pl.javastart.loteria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/loteria")
public class LoteriaController extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Integer> userNumbers = requestNumbers(request);
        List<Integer> randomNumbers = Loteria.getRandomNumbers();
        List<Integer> matchedNumbers = Loteria.compareNumbers(userNumbers, randomNumbers);
        LoteriaResults loteriaResults=new LoteriaResults(userNumbers,randomNumbers,matchedNumbers);
        request.setAttribute("loteriaResults", loteriaResults);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }

    private List<Integer> requestNumbers(HttpServletRequest request) {
        String[] numbersParameter = request.getParameterValues("numbers");
        return Arrays.stream(numbersParameter)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

}
